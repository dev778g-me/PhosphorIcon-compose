package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BoxingGloveFill: ImageVector
    get() {
        if (_BoxingGloveFill != null) {
            return _BoxingGloveFill!!
        }
        _BoxingGloveFill = ImageVector.Builder(
            name = "Filled.BoxingGloveFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 16f)
                lineTo(120f, 16f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 72f)
                verticalLineToRelative(31.73f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56.53f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 104f)
                lineTo(48f, 78.7f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.63f, -3.65f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 104f)
                verticalLineToRelative(29.19f)
                arcToRelative(16.14f, 16.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 10f)
                quadToRelative(0.3f, 0.36f, 0.63f, 0.69f)
                lineTo(64f, 179.34f)
                lineTo(64f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(192f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(208f, 177.12f)
                lineToRelative(15.38f, -53.84f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, -4.4f)
                lineTo(224f, 72f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 16f)
                close()
                moveTo(171.58f, 184.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.16f, 14.32f)
                lineTo(136f, 184.94f)
                lineToRelative(-28.42f, 14.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.16f, -14.32f)
                lineTo(118.11f, 176f)
                lineToRelative(-17.69f, -8.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.16f, -14.32f)
                lineTo(136f, 167.06f)
                lineToRelative(28.42f, -14.22f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.16f, 14.32f)
                lineTo(153.89f, 176f)
                close()
            }
        }.build()

        return _BoxingGloveFill!!
    }

@Suppress("ObjectPropertyName")
private var _BoxingGloveFill: ImageVector? = null
