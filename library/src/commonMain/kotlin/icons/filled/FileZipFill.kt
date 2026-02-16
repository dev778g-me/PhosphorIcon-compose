package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FileZipFill: ImageVector
    get() {
        if (_FileZipFill != null) {
            return _FileZipFill!!
        }
        _FileZipFill = ImageVector.Builder(
            name = "Filled.FileZipFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 144f)
                lineTo(168f, 144f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(55.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, -8f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(7.4f)
                curveToRelative(15.24f, 0f, 28.14f, -11.92f, 28.59f, -27.15f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 144f)
                close()
                moveTo(183.65f, 184f)
                lineTo(176f, 184f)
                lineTo(176f, 160f)
                horizontalLineToRelative(8f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 173.16f)
                arcTo(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 183.65f, 184f)
                close()
                moveTo(136f, 152f)
                verticalLineToRelative(55.73f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, -8f)
                lineTo(120f, 152.27f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 152f)
                close()
                moveTo(96f, 208.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.73f, 216f)
                lineTo(56.23f, 216f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -2.5f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 49.05f, 204f)
                lineToRelative(25.16f, -44f)
                lineTo(56.27f, 160f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 152.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 144f)
                lineTo(87.77f, 144f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2.5f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95f, 156f)
                lineTo(69.79f, 200f)
                lineTo(88f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 208.53f)
                close()
                moveTo(213.66f, 82.34f)
                lineToRelative(-56f, -56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 24f)
                lineTo(56f, 24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                verticalLineToRelative(76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(212f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(216f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 213.66f, 82.34f)
                close()
                moveTo(152f, 88f)
                lineTo(152f, 44f)
                lineToRelative(44f, 44f)
                close()
            }
        }.build()

        return _FileZipFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileZipFill: ImageVector? = null
