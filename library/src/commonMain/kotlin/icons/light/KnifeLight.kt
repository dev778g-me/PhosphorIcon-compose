package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.KnifeLight: ImageVector
    get() {
        if (_KnifeLight != null) {
            return _KnifeLight!!
        }
        _KnifeLight = ImageVector.Builder(
            name = "Light.KnifeLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(146f, 90f)
                lineToRelative(54f, 54f)
                reflectiveCurveToRelative(-72f, 92f, -176f, 68f)
                lineTo(198.2f, 37.8f)
                arcToRelative(19.8f, 19.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(19.8f, 19.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 28f)
                lineTo(174f, 118f)
            }
        }.build()

        return _KnifeLight!!
    }

@Suppress("ObjectPropertyName")
private var _KnifeLight: ImageVector? = null
