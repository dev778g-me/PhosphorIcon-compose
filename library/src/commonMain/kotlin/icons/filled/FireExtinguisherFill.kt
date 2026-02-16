package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FireExtinguisherFill: ImageVector
    get() {
        if (_FireExtinguisherFill != null) {
            return _FireExtinguisherFill!!
        }
        _FireExtinguisherFill = ImageVector.Builder(
            name = "Filled.FireExtinguisherFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(218.3f, 48.34f)
                lineToRelative(-60.68f, -18.2f)
                lineToRelative(30f, -15f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 180.42f, 0.85f)
                lineTo(134f, 24.05f)
                arcToRelative(80.08f, 80.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -78f, 80f)
                lineTo(56f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(72f, 176f)
                lineTo(88f, 176f)
                verticalLineToRelative(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(184f, 104f)
                arcToRelative(48.07f, 48.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -47.32f)
                lineTo(144f, 42.75f)
                lineToRelative(69.7f, 20.91f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.6f, -15.32f)
                close()
                moveTo(72f, 160f)
                lineTo(72f, 104f)
                arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -63.48f)
                lineTo(128f, 56.68f)
                arcTo(48.07f, 48.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 104f)
                verticalLineToRelative(56f)
                close()
                moveTo(168f, 104f)
                verticalLineToRelative(56f)
                lineTo(104f, 160f)
                lineTo(104f, 104f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 0f)
                close()
            }
        }.build()

        return _FireExtinguisherFill!!
    }

@Suppress("ObjectPropertyName")
private var _FireExtinguisherFill: ImageVector? = null
