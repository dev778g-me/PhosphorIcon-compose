package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.MegaphoneBold: ImageVector
    get() {
        if (_MegaphoneBold != null) {
            return _MegaphoneBold!!
        }
        _MegaphoneBold = ImageVector.Builder(
            name = "Bold.MegaphoneBold",
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
                moveTo(40f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.15f, 6.12f)
                curveTo(105.55f, 162.16f, 160f, 160f, 160f, 160f)
                horizontalLineToRelative(40f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -80f)
                horizontalLineTo(160f)
                reflectiveCurveTo(105.55f, 77.84f, 53.15f, 33.89f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 79.67f)
                verticalLineToRelative(121f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.56f, 6.65f)
                lineToRelative(15f, 7.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.2f, -4.72f)
                lineTo(200f, 160f)
            }
        }.build()

        return _MegaphoneBold!!
    }

@Suppress("ObjectPropertyName")
private var _MegaphoneBold: ImageVector? = null
