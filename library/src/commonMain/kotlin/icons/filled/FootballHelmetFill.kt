package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FootballHelmetFill: ImageVector
    get() {
        if (_FootballHelmetFill != null) {
            return _FootballHelmetFill!!
        }
        _FootballHelmetFill = ImageVector.Builder(
            name = "Filled.FootballHelmetFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 160f)
                lineTo(165.8f, 160f)
                lineToRelative(-7.09f, -24f)
                lineTo(216f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineToRelative(-4f)
                arcTo(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = false, 122.58f, 24f)
                curveTo(68.24f, 24.77f, 24f, 69.61f, 24f, 124f)
                arcTo(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.62f, 206.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.52f, 1.4f)
                lineTo(120f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.62f, -19.47f)
                arcToRelative(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.15f, -0.54f)
                lineToRelative(-3.56f, -12f)
                horizontalLineToRelative(21.93f)
                lineToRelative(10.79f, 36.53f)
                arcTo(16.1f, 16.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 180f, 224f)
                horizontalLineToRelative(36f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 176f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 160f)
                close()
                moveTo(84f, 176f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 176f)
                close()
                moveTo(127.16f, 160f)
                lineTo(120f, 136f)
                horizontalLineToRelative(22f)
                lineToRelative(7.09f, 24f)
                close()
                moveTo(216f, 208f)
                lineTo(180f, 208f)
                lineToRelative(-9.46f, -32f)
                lineTo(216f, 176f)
                close()
            }
        }.build()

        return _FootballHelmetFill!!
    }

@Suppress("ObjectPropertyName")
private var _FootballHelmetFill: ImageVector? = null
