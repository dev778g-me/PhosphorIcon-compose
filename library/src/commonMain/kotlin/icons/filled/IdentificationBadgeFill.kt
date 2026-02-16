package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.IdentificationBadgeFill: ImageVector
    get() {
        if (_IdentificationBadgeFill != null) {
            return _IdentificationBadgeFill!!
        }
        _IdentificationBadgeFill = ImageVector.Builder(
            name = "Filled.IdentificationBadgeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                close()
                moveTo(96f, 48f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(96f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                close()
                moveTo(180.81f, 198.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.21f, -1.6f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -83.2f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.8f, -9.6f)
                arcTo(67.88f, 67.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 101f, 165.51f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.94f, 0f)
                arcTo(67.88f, 67.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 182.4f, 187.2f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180.81f, 198.4f)
                close()
                moveTo(152f, 136f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, -24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 136f)
                close()
            }
        }.build()

        return _IdentificationBadgeFill!!
    }

@Suppress("ObjectPropertyName")
private var _IdentificationBadgeFill: ImageVector? = null
