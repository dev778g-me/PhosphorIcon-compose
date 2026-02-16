package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.CommandFill: ImageVector
    get() {
        if (_CommandFill != null) {
            return _CommandFill!!
        }
        _CommandFill = ImageVector.Builder(
            name = "Filled.CommandFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(116f, 116f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                lineTo(116f, 140f)
                close()
                moveTo(86f, 72f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 28f)
                horizontalLineToRelative(14f)
                lineTo(100f, 86f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 86f, 72f)
                close()
                moveTo(184f, 86f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28f, 0f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 86f)
                close()
                moveTo(72f, 170f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 0f)
                lineTo(100f, 156f)
                lineTo(86f, 156f)
                arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 170f)
                close()
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(156f, 140f)
                lineTo(156f, 116f)
                horizontalLineToRelative(14f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = false, -30f, -30f)
                verticalLineToRelative(14f)
                lineTo(116f, 100f)
                lineTo(116f, 86f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = false, -30f, 30f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(24f)
                lineTo(86f, 140f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = false, 30f, 30f)
                lineTo(116f, 156f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(14f)
                arcToRelative(30f, 30f, 0f, isMoreThanHalf = true, isPositiveArc = false, 30f, -30f)
                close()
                moveTo(156f, 170f)
                arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, -14f)
                lineTo(156f, 156f)
                close()
            }
        }.build()

        return _CommandFill!!
    }

@Suppress("ObjectPropertyName")
private var _CommandFill: ImageVector? = null
