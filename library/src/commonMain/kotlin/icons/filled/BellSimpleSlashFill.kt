package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BellSimpleSlashFill: ImageVector
    get() {
        if (_BellSimpleSlashFill != null) {
            return _BellSimpleSlashFill!!
        }
        _BellSimpleSlashFill = ImageVector.Builder(
            name = "Filled.BellSimpleSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.84f, 192f)
                verticalLineToRelative(0f)
                arcToRelative(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0.28f)
                lineTo(83.27f, 43.19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -6f)
                arcTo(79.55f, 79.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 129.17f, 24f)
                curveTo(173f, 24.66f, 207.8f, 61.1f, 208f, 104.92f)
                curveToRelative(0.14f, 34.88f, 8.31f, 61.54f, 13.82f, 71f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 221.84f, 192f)
                close()
                moveTo(160f, 216f)
                horizontalLineTo(96.22f)
                arcTo(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 223.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 232f)
                horizontalLineToRelative(63.74f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.26f, -7.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 216f)
                close()
                moveTo(53.84f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42f, 45.38f)
                lineTo(58.79f, 63.85f)
                arcTo(79.42f, 79.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.93f, 104f)
                curveToRelative(0f, 35.09f, -8.15f, 62f, -13.7f, 71.73f)
                arcToRelative(16.42f, 16.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, 16.68f)
                arcTo(15.78f, 15.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.91f, 200f)
                horizontalLineTo(182.62f)
                lineToRelative(19.45f, 21.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.85f, -10.76f)
                close()
            }
        }.build()

        return _BellSimpleSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _BellSimpleSlashFill: ImageVector? = null
