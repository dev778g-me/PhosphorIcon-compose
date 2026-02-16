package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ArrowElbowDownLeftBold: ImageVector
    get() {
        if (_ArrowElbowDownLeftBold != null) {
            return _ArrowElbowDownLeftBold!!
        }
        _ArrowElbowDownLeftBold = ImageVector.Builder(
            name = "Bold.ArrowElbowDownLeftBold",
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
                moveTo(96f, 128f)
                lineToRelative(-48f, 48f)
                lineToRelative(48f, 48f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(192f, 32f)
                lineToRelative(0f, 144f)
                lineToRelative(-144f, 0f)
            }
        }.build()

        return _ArrowElbowDownLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowDownLeftBold: ImageVector? = null
