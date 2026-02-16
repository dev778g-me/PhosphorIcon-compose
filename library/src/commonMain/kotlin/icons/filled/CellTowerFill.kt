package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CellTowerFill: ImageVector
    get() {
        if (_CellTowerFill != null) {
            return _CellTowerFill!!
        }
        _CellTowerFill = ImageVector.Builder(
            name = "Filled.CellTowerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(135.16f, 84.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.32f, 0f)
                lineToRelative(-72f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.31f, 7.16f)
                lineTo(77f, 208f)
                horizontalLineToRelative(102.1f)
                lineToRelative(13.79f, 27.58f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.15f, -11.58f)
                close()
                moveTo(128f, 105.89f)
                lineTo(155.06f, 160f)
                lineTo(100.94f, 160f)
                close()
                moveTo(159.49f, 93.74f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -63f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15.74f, 2.85f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 94.46f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.86f, 6.58f)
                arcToRelative(8.74f, 8.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.43f, -0.13f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 159.49f, 93.74f)
                close()
                moveTo(64.15f, 136.21f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 127.7f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.76f, -9.65f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -102.18f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.76f, 9.65f)
                close()
            }
        }.build()

        return _CellTowerFill!!
    }

@Suppress("ObjectPropertyName")
private var _CellTowerFill: ImageVector? = null
