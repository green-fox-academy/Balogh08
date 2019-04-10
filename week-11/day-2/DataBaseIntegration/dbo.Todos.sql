CREATE TABLE [dbo].[Todos] (
    [Id]       BIGINT         IDENTITY (1, 1) NOT NULL,
    [Title]    NVARCHAR (MAX) NOT NULL,
    [IsUrgent] BIT            NULL,
    [IsDone]   BIT            NULL,
    CONSTRAINT [PK_Todos] PRIMARY KEY CLUSTERED ([Id] ASC)
);

