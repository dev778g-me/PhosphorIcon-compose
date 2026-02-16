package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.MetaLogoDuotone: ImageVector
    get() {
        if (_MetaLogoDuotone != null) {
            return _MetaLogoDuotone!!
        }
        _MetaLogoDuotone = ImageVector.Builder(
            name = "Duotone.MetaLogoDuotone",
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
                moveTo(182f, 56f)
                curveToRelative(-12.62f, 0f, -24.1f, 10.7f, -35f, 26.27f)
                lineTo(128.49f, 114.6f)
                curveToRelative(21.76f, 39.86f, 42.91f, 85.4f, 68.95f, 85.4f)
                curveTo(259.16f, 200f, 228.3f, 56f, 182f, 56f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(74f, 56f)
                curveTo(27.7f, 56f, -3.16f, 200f, 58.56f, 200f)
                curveToRelative(19f, 0f, 35.32f, -24.14f, 51.22f, -52.65f)
                lineToRelative(18.71f, -32.75f)
                curveTo(111.56f, 83.58f, 94.25f, 56f, 74f, 56f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(109.78f, 147.35f)
                curveTo(93.88f, 175.86f, 77.52f, 200f, 58.56f, 200f)
                curveTo(-3.16f, 200f, 27.7f, 56f, 74f, 56f)
                reflectiveCurveToRelative(77.15f, 144f, 123.45f, 144f)
                curveTo(259.16f, 200f, 228.3f, 56f, 182f, 56f)
                curveToRelative(-12.62f, 0f, -24.1f, 10.7f, -35f, 26.27f)
            }
        }.build()

        return _MetaLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MetaLogoDuotone: ImageVector? = null
