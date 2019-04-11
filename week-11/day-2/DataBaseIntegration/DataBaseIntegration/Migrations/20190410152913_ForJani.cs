using Microsoft.EntityFrameworkCore.Migrations;

namespace DataBaseIntegration.Migrations
{
    public partial class ForJani : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "ForJani",
                table: "Todos",
                nullable: true);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "ForJani",
                table: "Todos");
        }
    }
}
