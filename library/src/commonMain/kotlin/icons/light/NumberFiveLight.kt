package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.NumberFiveLight: ImageVector
    get() {
        if (_NumberFiveLight != null) {
            return _NumberFiveLight!!
        }
        _NumberFiveLight = ImageVector.Builder(
            name = "Light.NumberFiveLight",
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
                moveTo(88f, 195.78f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.92f, -72.36f)
                lineTo(104f, 48f)
                horizontalLineToRelative(64f)
            }
        }.build()

        return _NumberFiveLight!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFiveLight: ImageVector? = null
