class RemoveTimestampsFromDancer < ActiveRecord::Migration
  def up
    remove_column :dancers, :created_at
        remove_column :dancers, :updated_at
      end

  def down
    add_column :dancers, :updated_at, :string
    add_column :dancers, :created_at, :string
  end
end
