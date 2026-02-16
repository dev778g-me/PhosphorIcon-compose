package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MetaLogoFill: ImageVector
    get() {
        if (_MetaLogoFill != null) {
            return _MetaLogoFill!!
        }
        _MetaLogoFill = ImageVector.Builder(
            name = "Filled.MetaLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(201.23f, 170.26f)
                curveToRelative(-5.63f, 9f, -14.33f, 13.74f, -25.16f, 13.74f)
                curveToRelative(-20.73f, 0f, -34.81f, -25.31f, -49.72f, -52.11f)
                curveTo(115.47f, 112.33f, 101.93f, 88f, 90.61f, 88f)
                curveTo(78.18f, 88f, 64f, 116.88f, 64f, 142.21f)
                curveToRelative(0f, 8.26f, 1.5f, 15f, 4.34f, 19.56f)
                curveTo(71f, 166f, 74.68f, 168f, 79.93f, 168f)
                curveToRelative(6.08f, 0f, 13.52f, -7f, 22.74f, -21.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.49f, 8.59f)
                curveTo(99.84f, 180.71f, 88.22f, 184f, 79.93f, 184f)
                curveToRelative(-10.83f, 0f, -19.53f, -4.75f, -25.16f, -13.74f)
                curveToRelative(-4.43f, -7.08f, -6.77f, -16.78f, -6.77f, -28f)
                arcTo(103.13f, 103.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 59f, 97.06f)
                curveTo(67.34f, 80.9f, 78.57f, 72f, 90.61f, 72f)
                curveToRelative(20.73f, 0f, 34.81f, 25.31f, 49.72f, 52.11f)
                curveTo(151.21f, 143.66f, 164.75f, 168f, 176.07f, 168f)
                curveToRelative(5.25f, 0f, 8.93f, -2f, 11.59f, -6.23f)
                curveToRelative(2.84f, -4.53f, 4.34f, -11.3f, 4.34f, -19.56f)
                curveTo(192f, 116.88f, 177.82f, 88f, 165.39f, 88f)
                curveToRelative(-3.4f, 0f, -7.35f, 2.31f, -11.74f, 6.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.54f, -11.09f)
                curveTo(149.74f, 75.86f, 157.35f, 72f, 165.39f, 72f)
                curveToRelative(12f, 0f, 23.27f, 8.9f, 31.62f, 25.06f)
                arcToRelative(103.13f, 103.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 45.15f)
                curveTo(208f, 153.48f, 205.66f, 163.18f, 201.23f, 170.26f)
                close()
            }
        }.build()

        return _MetaLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MetaLogoFill: ImageVector? = null
