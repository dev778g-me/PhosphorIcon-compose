package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CoffeeFill: ImageVector
    get() {
        if (_CoffeeFill != null) {
            return _CoffeeFill!!
        }
        _CoffeeFill = ImageVector.Builder(
            name = "Filled.CoffeeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 80f)
                lineTo(32f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(48f)
                arcToRelative(96.3f, 96.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.54f, 72f)
                lineTo(32f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(208f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(183.46f, 208f)
                arcToRelative(96.59f, 96.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27f, -40.09f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 248f, 128f)
                verticalLineToRelative(-8f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 80f)
                close()
                moveTo(232f, 128f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.2f, 23f)
                arcToRelative(95.78f, 95.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, -15f)
                lineTo(216f, 97.38f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 120f)
                close()
                moveTo(112f, 56f)
                lineTo(112f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(128f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(144f, 56f)
                lineTo(144f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(160f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(80f, 56f)
                lineTo(80f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(96f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                close()
            }
        }.build()

        return _CoffeeFill!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeFill: ImageVector? = null
