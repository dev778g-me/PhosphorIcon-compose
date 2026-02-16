package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.ArrowFatLinesRightDuotone: ImageVector
    get() {
        if (_ArrowFatLinesRightDuotone != null) {
            return _ArrowFatLinesRightDuotone!!
        }
        _ArrowFatLinesRightDuotone = ImageVector.Builder(
            name = "Duotone.ArrowFatLinesRightDuotone",
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
                moveTo(136f, 32f)
                lineToRelative(96f, 96f)
                lineToRelative(-96f, 96f)
                lineToRelative(0f, -48f)
                lineToRelative(-32f, 0f)
                lineToRelative(0f, -96f)
                lineToRelative(32f, 0f)
                lineToRelative(0f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 32f)
                lineToRelative(96f, 96f)
                lineToRelative(-96f, 96f)
                lineToRelative(0f, -48f)
                lineToRelative(-32f, 0f)
                lineToRelative(0f, -96f)
                lineToRelative(32f, 0f)
                lineToRelative(0f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 176f)
                lineTo(40f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 176f)
                lineTo(72f, 80f)
            }
        }.build()

        return _ArrowFatLinesRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesRightDuotone: ImageVector? = null
