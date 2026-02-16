package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ArrowCounterClockwiseFill: ImageVector
    get() {
        if (_ArrowCounterClockwiseFill != null) {
            return _ArrowCounterClockwiseFill!!
        }
        _ArrowCounterClockwiseFill = ImageVector.Builder(
            name = "Filled.ArrowCounterClockwiseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 128f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -94.71f, 96f)
                horizontalLineTo(128f)
                arcTo(95.38f, 95.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.1f, 197.8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, -11.63f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 71.43f, 71.39f)
                arcToRelative(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.26f, 0.25f)
                lineTo(60.63f, 81.29f)
                lineToRelative(17f, 17f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 112f)
                horizontalLineTo(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.66f, 50.3f)
                lineTo(49.31f, 70f)
                lineTo(60.25f, 60f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 128f)
                close()
            }
        }.build()

        return _ArrowCounterClockwiseFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCounterClockwiseFill: ImageVector? = null
