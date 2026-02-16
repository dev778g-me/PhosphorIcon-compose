package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BombFill: ImageVector
    get() {
        if (_BombFill != null) {
            return _BombFill!!
        }
        _BombFill = ImageVector.Builder(
            name = "Filled.BombFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 32f)
                horizontalLineToRelative(0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                arcToRelative(52.66f, 52.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.57f, 17.39f)
                curveTo(232.38f, 67.22f, 225.7f, 72f, 216f, 72f)
                curveToRelative(-11.06f, 0f, -18.85f, -9.76f, -29.49f, -24.65f)
                curveTo(176f, 32.66f, 164.12f, 16f, 144f, 16f)
                curveToRelative(-16.39f, 0f, -29f, 8.89f, -35.43f, 25f)
                arcToRelative(66.07f, 66.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.9f, 15f)
                horizontalLineTo(88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 72f)
                verticalLineToRelative(9.59f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 248f)
                horizontalLineToRelative(1.59f)
                arcTo(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 81.59f)
                verticalLineTo(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(120.88f)
                arcToRelative(46.76f, 46.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.69f, -9.37f)
                curveTo(127.62f, 36.78f, 134.3f, 32f, 144f, 32f)
                curveToRelative(11.06f, 0f, 18.85f, 9.76f, 29.49f, 24.65f)
                curveTo(184f, 71.34f, 195.88f, 88f, 216f, 88f)
                curveToRelative(16.39f, 0f, 29f, -8.89f, 35.43f, -25f)
                arcTo(68.69f, 68.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 32f)
                close()
                moveTo(111.89f, 209.32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 216f)
                arcToRelative(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.33f, -0.11f)
                arcToRelative(57.5f, 57.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -46.57f, -46.57f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.78f, -2.64f)
                arcToRelative(41.29f, 41.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 33.43f, 33.43f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 111.89f, 209.32f)
                close()
            }
        }.build()

        return _BombFill!!
    }

@Suppress("ObjectPropertyName")
private var _BombFill: ImageVector? = null
