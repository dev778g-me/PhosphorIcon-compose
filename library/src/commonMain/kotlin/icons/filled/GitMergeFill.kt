package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GitMergeFill: ImageVector
    get() {
        if (_GitMergeFill != null) {
            return _GitMergeFill!!
        }
        _GitMergeFill = ImageVector.Builder(
            name = "Filled.GitMergeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 112f)
                arcToRelative(32.05f, 32.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -30.69f, 23f)
                lineToRelative(-42.21f, -6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.95f, -2.71f)
                lineTo(94.43f, 84.55f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 72f, 87f)
                verticalLineToRelative(82f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 0f)
                lineTo(88f, 101.63f)
                lineToRelative(30f, 35f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.83f, 8.14f)
                lineToRelative(44f, 6.28f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 208f, 112f)
                close()
                moveTo(96f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 200f)
                close()
                moveTo(208f, 160f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 160f)
                close()
            }
        }.build()

        return _GitMergeFill!!
    }

@Suppress("ObjectPropertyName")
private var _GitMergeFill: ImageVector? = null
