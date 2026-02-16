package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.LightningSlashDuotone: ImageVector
    get() {
        if (_LightningSlashDuotone != null) {
            return _LightningSlashDuotone!!
        }
        _LightningSlashDuotone = ImageVector.Builder(
            name = "Duotone.LightningSlashDuotone",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(114.12f, 65.16f)
                lineToRelative(45.88f, -49.16f)
                lineToRelative(-16f, 80f)
                lineToRelative(64f, 24f)
                lineToRelative(-22.3f, 23.9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(163.79f, 167.37f)
                lineToRelative(-67.79f, 72.63f)
                lineToRelative(16f, -80f)
                lineToRelative(-64f, -24f)
                lineToRelative(44.21f, -47.37f)
            }
        }.build()

        return _LightningSlashDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LightningSlashDuotone: ImageVector? = null
