package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.EnvelopeSimpleOpenBold: ImageVector
    get() {
        if (_EnvelopeSimpleOpenBold != null) {
            return _EnvelopeSimpleOpenBold!!
        }
        _EnvelopeSimpleOpenBold = ImageVector.Builder(
            name = "Bold.EnvelopeSimpleOpenBold",
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
                moveTo(224f, 96f)
                verticalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(96f)
                lineToRelative(96f, -64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(224f, 96f)
                lineToRelative(-78.54f, 56f)
                lineToRelative(-34.91f, 0f)
                lineToRelative(-78.55f, -56f)
            }
        }.build()

        return _EnvelopeSimpleOpenBold!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeSimpleOpenBold: ImageVector? = null
