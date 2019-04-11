using Microsoft.EntityFrameworkCore.Migrations;

namespace DataBaseIntegration.Migrations
{
    public partial class ForLaci : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "ForLaci",
                table: "Todos",
                nullable: true);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "ForLaci",
                table: "Todos");
        }
    }
}
