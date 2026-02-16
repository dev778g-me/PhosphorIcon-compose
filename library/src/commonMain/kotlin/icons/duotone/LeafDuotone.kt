package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.LeafDuotone: ImageVector
    get() {
        if (_LeafDuotone != null) {
            return _LeafDuotone!!
        }
        _LeafDuotone = ImageVector.Builder(
            name = "Duotone.LeafDuotone",
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
                moveTo(63.81f, 192.19f)
                curveToRelative(-47.89f, -79.81f, 16f, -159.62f, 151.64f, -151.64f)
                curveTo(223.43f, 176.23f, 143.62f, 240.08f, 63.81f, 192.19f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 96f)
                lineTo(40f, 216f)
            }
        }.build()

        return _LeafDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LeafDuotone: ImageVector? = null
