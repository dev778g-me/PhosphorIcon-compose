package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.EnvelopeOpenFill: ImageVector
    get() {
        if (_EnvelopeOpenFill != null) {
            return _EnvelopeOpenFill!!
        }
        _EnvelopeOpenFill = ImageVector.Builder(
            name = "Filled.EnvelopeOpenFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(228.44f, 89.34f)
                lineToRelative(-96f, -64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.88f, 0f)
                lineToRelative(-96f, 64f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 96f)
                lineTo(24f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228.44f, 89.34f)
                close()
                moveTo(96.72f, 152f)
                lineTo(40f, 192f)
                lineTo(40f, 111.53f)
                close()
                moveTo(113.09f, 160f)
                horizontalLineToRelative(29.82f)
                lineToRelative(56.63f, 40f)
                lineTo(56.46f, 200f)
                close()
                moveTo(159.28f, 152f)
                lineTo(216f, 111.53f)
                lineTo(216f, 192f)
                close()
            }
        }.build()

        return _EnvelopeOpenFill!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeOpenFill: ImageVector? = null
