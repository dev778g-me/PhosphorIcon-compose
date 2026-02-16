package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.EnvelopeSimpleOpenFill: ImageVector
    get() {
        if (_EnvelopeSimpleOpenFill != null) {
            return _EnvelopeSimpleOpenFill!!
        }
        _EnvelopeSimpleOpenFill = ImageVector.Builder(
            name = "Filled.EnvelopeSimpleOpenFill",
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
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 228.44f, 89.34f)
                close()
                moveTo(40f, 200f)
                verticalLineTo(111.53f)
                lineToRelative(65.9f, 47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.65f, 1.49f)
                horizontalLineToRelative(34.9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.65f, -1.49f)
                lineToRelative(65.9f, -47f)
                verticalLineTo(200f)
                close()
            }
        }.build()

        return _EnvelopeSimpleOpenFill!!
    }

@Suppress("ObjectPropertyName")
private var _EnvelopeSimpleOpenFill: ImageVector? = null
