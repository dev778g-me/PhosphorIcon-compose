package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PicnicTableFill: ImageVector
    get() {
        if (_PicnicTableFill != null) {
            return _PicnicTableFill!!
        }
        _PicnicTableFill = ImageVector.Builder(
            name = "Filled.PicnicTableFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(146.85f, 96f)
                lineToRelative(14.54f, 32f)
                lineTo(94.61f, 128f)
                lineToRelative(14.54f, -32f)
                close()
                moveTo(232f, 56f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(208f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(179f, 128f)
                lineTo(164.42f, 96f)
                lineTo(176f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(80f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(91.58f, 96f)
                lineTo(77f, 128f)
                lineTo(56f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(69.76f, 144f)
                lineToRelative(-13f, 28.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14.56f, 6.62f)
                lineToRelative(16f, -35.31f)
                horizontalLineToRelative(81.34f)
                lineToRelative(16.05f, 35.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.56f, -6.62f)
                lineToRelative(-13f, -28.69f)
                lineTo(200f, 144f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 136f)
                close()
            }
        }.build()

        return _PicnicTableFill!!
    }

@Suppress("ObjectPropertyName")
private var _PicnicTableFill: ImageVector? = null
