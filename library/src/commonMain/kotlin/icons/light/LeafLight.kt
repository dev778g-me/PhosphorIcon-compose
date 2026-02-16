package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.LeafLight: ImageVector
    get() {
        if (_LeafLight != null) {
            return _LeafLight!!
        }
        _LeafLight = ImageVector.Builder(
            name = "Light.LeafLight",
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
                moveTo(63.81f, 192.19f)
                curveToRelative(-47.89f, -79.81f, 16f, -159.62f, 151.64f, -151.64f)
                curveTo(223.43f, 176.23f, 143.62f, 240.08f, 63.81f, 192.19f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 96f)
                lineTo(40f, 216f)
            }
        }.build()

        return _LeafLight!!
    }

@Suppress("ObjectPropertyName")
private var _LeafLight: ImageVector? = null
