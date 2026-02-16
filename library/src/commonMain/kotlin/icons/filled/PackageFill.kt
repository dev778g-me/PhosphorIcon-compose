package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PackageFill: ImageVector
    get() {
        if (_PackageFill != null) {
            return _PackageFill!!
        }
        _PackageFill = ImageVector.Builder(
            name = "Filled.PackageFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(223.68f, 66.15f)
                lineTo(135.68f, 18f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.36f, 0f)
                lineToRelative(-88f, 48.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.32f, 14f)
                verticalLineToRelative(95.64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, 14f)
                lineToRelative(88f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.36f, 0f)
                lineToRelative(88f, -48.17f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.32f, -14f)
                lineTo(232f, 80.18f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 223.68f, 66.15f)
                close()
                moveTo(128f, 32f)
                lineToRelative(80.35f, 44f)
                lineTo(178.57f, 92.29f)
                lineToRelative(-80.35f, -44f)
                close()
                moveTo(128f, 120f)
                lineTo(47.65f, 76f)
                lineTo(81.56f, 57.43f)
                lineToRelative(80.35f, 44f)
                close()
                moveTo(216f, 175.85f)
                horizontalLineToRelative(0f)
                lineToRelative(-80f, 43.79f)
                lineTo(136f, 133.83f)
                lineToRelative(32f, -17.51f)
                lineTo(168f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(184f, 107.56f)
                lineToRelative(32f, -17.51f)
                verticalLineToRelative(85.76f)
                close()
            }
        }.build()

        return _PackageFill!!
    }

@Suppress("ObjectPropertyName")
private var _PackageFill: ImageVector? = null
