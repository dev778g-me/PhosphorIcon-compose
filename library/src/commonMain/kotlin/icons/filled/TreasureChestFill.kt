package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TreasureChestFill: ImageVector
    get() {
        if (_TreasureChestFill != null) {
            return _TreasureChestFill!!
        }
        _TreasureChestFill = ImageVector.Builder(
            name = "Filled.TreasureChestFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 124f)
                verticalLineToRelative(68f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(124f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                horizontalLineTo(56f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 183.73f)
                verticalLineTo(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineTo(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, 8f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, -8.25f)
                verticalLineTo(120f)
                horizontalLineToRelative(36f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 124f)
                close()
                moveTo(184f, 40f)
                horizontalLineTo(72f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 96f)
                verticalLineToRelative(4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineTo(56f)
                verticalLineTo(64.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.47f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 64f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineTo(92f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                horizontalLineToRelative(24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(40f)
                verticalLineTo(64.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 191.47f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 64f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(36f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                verticalLineTo(96f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 40f)
                close()
            }
        }.build()

        return _TreasureChestFill!!
    }

@Suppress("ObjectPropertyName")
private var _TreasureChestFill: ImageVector? = null
