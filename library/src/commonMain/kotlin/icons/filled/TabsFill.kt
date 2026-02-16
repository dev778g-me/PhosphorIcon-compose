package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TabsFill: ImageVector
    get() {
        if (_TabsFill != null) {
            return _TabsFill!!
        }
        _TabsFill = ImageVector.Builder(
            name = "Filled.TabsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.37f, 165.6f)
                lineTo(22.63f, 91.4f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38f, 80f)
                horizontalLineToRelative(84.1f)
                arcToRelative(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.32f, 11.4f)
                lineTo(158f, 160f)
                horizontalLineToRelative(15.3f)
                lineTo(150.79f, 85.15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 154.62f, 80f)
                horizontalLineToRelative(15.43f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.32f, 11.4f)
                lineTo(206f, 160f)
                horizontalLineToRelative(15.3f)
                lineTo(198.79f, 85.15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 202.62f, 80f)
                horizontalLineToRelative(15.43f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.32f, 11.4f)
                lineToRelative(22.26f, 74.18f)
                arcTo(8.11f, 8.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 168f)
                close()
            }
        }.build()

        return _TabsFill!!
    }

@Suppress("ObjectPropertyName")
private var _TabsFill: ImageVector? = null
