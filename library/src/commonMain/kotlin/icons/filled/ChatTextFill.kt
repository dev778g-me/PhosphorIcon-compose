package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ChatTextFill: ImageVector
    get() {
        if (_ChatTextFill != null) {
            return _ChatTextFill!!
        }
        _ChatTextFill = ImageVector.Builder(
            name = "Filled.ChatTextFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 48f)
                lineTo(40f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 64f)
                lineTo(24f, 224f)
                arcToRelative(15.84f, 15.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.25f, 14.5f)
                arcTo(16.05f, 16.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 240f)
                arcToRelative(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, -3.78f)
                lineToRelative(0.09f, -0.07f)
                lineTo(83f, 208f)
                lineTo(216f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 48f)
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

        return _ChatTextFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChatTextFill: ImageVector? = null
