class AddVideoCountColumnToDancers < ActiveRecord::Migration
  def change
    add_column :dancers, :video_count, :integer
  end
end
