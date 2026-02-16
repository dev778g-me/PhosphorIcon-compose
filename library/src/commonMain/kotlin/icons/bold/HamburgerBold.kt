package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.HamburgerBold: ImageVector
    get() {
        if (_HamburgerBold != null) {
            return _HamburgerBold!!
        }
        _HamburgerBold = ImageVector.Builder(
            name = "Bold.HamburgerBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 180f)
                lineToRelative(44f, -16f)
                lineToRelative(40f, 16f)
                lineToRelative(40f, -16f)
                lineToRelative(40f, 16f)
                lineToRelative(44f, -16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(24f, 128f)
                lineTo(232f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 172.73f)
                verticalLineTo(184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                horizontalLineTo(80f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
                verticalLineTo(171.27f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48.2f, 92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.83f, -10.29f)
                curveTo(49.49f, 53.24f, 85.26f, 32f, 128f, 32f)
                reflectiveCurveToRelative(78.52f, 21.25f, 87.63f, 49.73f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 207.8f, 92f)
                close()
            }
        }.build()

        return _HamburgerBold!!
    }

@Suppress("ObjectPropertyName")
private var _HamburgerBold: ImageVector? = null
