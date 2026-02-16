package icons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Light.SupersetProperOfLight: ImageVector
    get() {
        if (_SupersetProperOfLight != null) {
            return _SupersetProperOfLight!!
        }
        _SupersetProperOfLight = ImageVector.Builder(
            name = "Light.SupersetProperOfLight",
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
                moveTo(64f, 208f)
                horizontalLineToRelative(72f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -160f)
                horizontalLineTo(64f)
            }
        }.build()

        return _SupersetProperOfLight!!
    }

@Suppress("ObjectPropertyName")
private var _SupersetProperOfLight: ImageVector? = null
