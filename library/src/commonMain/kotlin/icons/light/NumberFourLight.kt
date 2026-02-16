package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.NumberFourLight: ImageVector
    get() {
        if (_NumberFourLight != null) {
            return _NumberFourLight!!
        }
        _NumberFourLight = ImageVector.Builder(
            name = "Light.NumberFourLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 12f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 168f)
                lineToRelative(-120f, 0f)
                lineToRelative(96f, -120f)
                lineToRelative(0f, 160f)
            }
        }.build()

        return _NumberFourLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFourLight: ImageVector? = null
