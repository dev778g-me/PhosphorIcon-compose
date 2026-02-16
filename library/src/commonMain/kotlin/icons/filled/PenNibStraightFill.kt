package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PenNibStraightFill: ImageVector
    get() {
        if (_PenNibStraightFill != null) {
            return _PenNibStraightFill!!
        }
        _PenNibStraightFill = ImageVector.Builder(
            name = "Filled.PenNibStraightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(222.33f, 123.89f)
                curveToRelative(-0.06f, -0.13f, -0.12f, -0.26f, -0.19f, -0.38f)
                lineTo(192f, 69.91f)
                verticalLineTo(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 32f)
                verticalLineTo(69.9f)
                lineTo(33.86f, 123.51f)
                curveToRelative(-0.07f, 0.12f, -0.13f, 0.25f, -0.2f, 0.38f)
                arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.46f, 16.57f)
                lineToRelative(0.11f, 0.14f)
                lineToRelative(77.61f, 100.81f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 239f)
                verticalLineTo(154.63f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                verticalLineTo(239f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 2.44f)
                lineToRelative(77.6f, -100.81f)
                lineToRelative(0.11f, -0.14f)
                arcTo(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 222.33f, 123.89f)
                close()
                moveTo(176f, 64f)
                horizontalLineTo(80f)
                verticalLineTo(32f)
                horizontalLineToRelative(96f)
                close()
            }
        }.build()

        return _PenNibStraightFill!!
    }

@Suppress("ObjectPropertyName")
private var _PenNibStraightFill: ImageVector? = null
