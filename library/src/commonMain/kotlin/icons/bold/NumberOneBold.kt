package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.NumberOneBold: ImageVector
    get() {
        if (_NumberOneBold != null) {
            return _NumberOneBold!!
        }
        _NumberOneBold = ImageVector.Builder(
            name = "Bold.NumberOneBold",
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
                moveTo(96f, 72f)
                lineToRelative(40f, -24f)
                lineToRelative(0f, 160f)
            }
        }.build()

        return _NumberOneBold!!
    }

@Suppress("ObjectPropertyName")
private var _NumberOneBold: ImageVector? = null
