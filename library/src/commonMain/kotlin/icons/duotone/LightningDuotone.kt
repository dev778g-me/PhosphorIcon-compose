package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.LightningDuotone: ImageVector
    get() {
        if (_LightningDuotone != null) {
            return _LightningDuotone!!
        }
        _LightningDuotone = ImageVector.Builder(
            name = "Duotone.LightningDuotone",
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
                moveTo(160f, 16f)
                lineToRelative(-16f, 80f)
                lineToRelative(64f, 24f)
                lineToRelative(-112f, 120f)
                lineToRelative(16f, -80f)
                lineToRelative(-64f, -24f)
                lineToRelative(112f, -120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 16f)
                lineToRelative(-16f, 80f)
                lineToRelative(64f, 24f)
                lineToRelative(-112f, 120f)
                lineToRelative(16f, -80f)
                lineToRelative(-64f, -24f)
                lineToRelative(112f, -120f)
                close()
            }
        }.build()

        return _LightningDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LightningDuotone: ImageVector? = null
