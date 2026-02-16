package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.PatreonLogoDuotone: ImageVector
    get() {
        if (_PatreonLogoDuotone != null) {
            return _PatreonLogoDuotone!!
        }
        _PatreonLogoDuotone = ImageVector.Builder(
            name = "Duotone.PatreonLogoDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(151.75f, 158.5f)
                curveTo(175.83f, 142.16f, 224f, 142.16f, 224f, 93.16f)
                curveToRelative(0f, -65.34f, -104.36f, -81.67f, -152.53f, -32.67f)
                curveTo(25.78f, 107f, 55.41f, 232f, 87.52f, 232f)
                reflectiveCurveTo(121.88f, 178.76f, 151.75f, 158.5f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(151.75f, 158.5f)
                curveTo(175.83f, 142.16f, 224f, 142.16f, 224f, 93.16f)
                curveToRelative(0f, -65.34f, -104.36f, -81.67f, -152.53f, -32.67f)
                curveTo(25.78f, 107f, 55.41f, 232f, 87.52f, 232f)
                reflectiveCurveTo(121.88f, 178.76f, 151.75f, 158.5f)
                close()
            }
        }.build()

        return _PatreonLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PatreonLogoDuotone: ImageVector? = null
