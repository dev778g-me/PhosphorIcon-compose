package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MagnetStraightFill: ImageVector
    get() {
        if (_MagnetStraightFill != null) {
            return _MagnetStraightFill!!
        }
        _MagnetStraightFill = ImageVector.Builder(
            name = "Filled.MagnetStraightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 40f)
                lineTo(160f, 40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
                lineTo(112f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 40f)
                lineTo(56f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 56f)
                verticalLineToRelative(88f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 88f)
                horizontalLineToRelative(0.67f)
                curveToRelative(48.15f, -0.36f, 87.33f, -40.29f, 87.33f, -89f)
                lineTo(216f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 40f)
                close()
                moveTo(200f, 56f)
                lineTo(200f, 96f)
                lineTo(160f, 96f)
                lineTo(160f, 56f)
                close()
                moveTo(96f, 56f)
                lineTo(96f, 96f)
                lineTo(56f, 96f)
                lineTo(56f, 56f)
                close()
            }
        }.build()

        return _MagnetStraightFill!!
    }

@Suppress("ObjectPropertyName")
private var _MagnetStraightFill: ImageVector? = null
