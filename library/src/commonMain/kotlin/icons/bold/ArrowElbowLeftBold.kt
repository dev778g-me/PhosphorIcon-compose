package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.ArrowElbowLeftBold: ImageVector
    get() {
        if (_ArrowElbowLeftBold != null) {
            return _ArrowElbowLeftBold!!
        }
        _ArrowElbowLeftBold = ImageVector.Builder(
            name = "Bold.ArrowElbowLeftBold",
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
                moveTo(96f, 80f)
                lineToRelative(-72f, 0f)
                lineToRelative(0f, 72f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(232f, 96f)
                lineToRelative(-96f, 96f)
                lineToRelative(-112f, -112f)
            }
        }.build()

        return _ArrowElbowLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowElbowLeftBold: ImageVector? = null
