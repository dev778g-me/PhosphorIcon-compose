package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.LightningADuotone: ImageVector
    get() {
        if (_LightningADuotone != null) {
            return _LightningADuotone!!
        }
        _LightningADuotone = ImageVector.Builder(
            name = "Duotone.LightningADuotone",
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
                moveTo(127.2f, 24f)
                lineToRelative(-15.2f, 64f)
                lineToRelative(56f, 25.14f)
                lineToRelative(-95.2f, 102.86f)
                lineToRelative(15.2f, -64f)
                lineToRelative(-56f, -25.14f)
                lineToRelative(95.2f, -102.86f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(127.2f, 24f)
                lineToRelative(-15.2f, 64f)
                lineToRelative(56f, 25.14f)
                lineToRelative(-95.2f, 102.86f)
                lineToRelative(15.2f, -64f)
                lineToRelative(-56f, -25.14f)
                lineToRelative(95.2f, -102.86f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 216f)
                lineToRelative(-36f, -72f)
                lineToRelative(-36f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(220f, 192f)
                lineTo(172f, 192f)
            }
        }.build()

        return _LightningADuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LightningADuotone: ImageVector? = null
