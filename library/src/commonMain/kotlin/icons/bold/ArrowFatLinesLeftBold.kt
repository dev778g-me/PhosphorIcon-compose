package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ArrowFatLinesLeftBold: ImageVector
    get() {
        if (_ArrowFatLinesLeftBold != null) {
            return _ArrowFatLinesLeftBold!!
        }
        _ArrowFatLinesLeftBold = ImageVector.Builder(
            name = "Bold.ArrowFatLinesLeftBold",
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
                moveTo(120f, 32f)
                lineToRelative(-96f, 96f)
                lineToRelative(96f, 96f)
                lineToRelative(0f, -48f)
                lineToRelative(16f, 0f)
                lineToRelative(0f, -96f)
                lineToRelative(-16f, 0f)
                lineToRelative(0f, -48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(216f, 176f)
                lineTo(216f, 80f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 176f)
                lineTo(176f, 80f)
            }
        }.build()

        return _ArrowFatLinesLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowFatLinesLeftBold: ImageVector? = null
