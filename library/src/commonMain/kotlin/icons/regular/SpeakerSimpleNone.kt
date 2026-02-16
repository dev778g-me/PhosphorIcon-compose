package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Regular.SpeakerSimpleNone: ImageVector
    get() {
        if (_SpeakerSimpleNone != null) {
            return _SpeakerSimpleNone!!
        }
        _SpeakerSimpleNone = ImageVector.Builder(
            name = "Regular.SpeakerSimpleNone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 168f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineTo(88f)
                lineToRelative(72f, -56f)
                verticalLineTo(224f)
                close()
            }
        }.build()

        return _SpeakerSimpleNone!!
    }

@Suppress("ObjectPropertyName")
private var _SpeakerSimpleNone: ImageVector? = null
