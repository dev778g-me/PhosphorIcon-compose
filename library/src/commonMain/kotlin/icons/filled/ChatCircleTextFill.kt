package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ChatCircleTextFill: ImageVector
    get() {
        if (_ChatCircleTextFill != null) {
            return _ChatCircleTextFill!!
        }
        _ChatCircleTextFill = ImageVector.Builder(
            name = "Filled.ChatCircleTextFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.18f, 176.88f)
                lineTo(24.83f, 210.93f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.24f, 20.24f)
                lineToRelative(34.05f, -11.35f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(160f, 152f)
                lineTo(96f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(160f, 120f)
                lineTo(96f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _ChatCircleTextFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatCircleTextFill: ImageVector? = null
