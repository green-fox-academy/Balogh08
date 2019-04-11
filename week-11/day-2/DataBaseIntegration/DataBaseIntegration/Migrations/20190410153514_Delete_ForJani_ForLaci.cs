using Microsoft.EntityFrameworkCore.Migrations;

namespace DataBaseIntegration.Migrations
{
    public partial class Delete_ForJani_ForLaci : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "ForJani",
                table: "Todos");

            migrationBuilder.DropColumn(
                name: "ForLaci",
                table: "Todos");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "ForJani",
                table: "Todos",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "ForLaci",
                table: "Todos",
                nullable: true);
        }
    }
}
