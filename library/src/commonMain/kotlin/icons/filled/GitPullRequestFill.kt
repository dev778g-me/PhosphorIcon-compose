package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GitPullRequestFill: ImageVector
    get() {
        if (_GitPullRequestFill != null) {
            return _GitPullRequestFill!!
        }
        _GitPullRequestFill = ImageVector.Builder(
            name = "Filled.GitPullRequestFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(104f, 64f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 95f)
                verticalLineToRelative(66f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 0f)
                lineTo(80f, 95f)
                arcTo(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 64f)
                close()
                moveTo(88f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 192f)
                close()
                moveTo(232f, 192f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -31f)
                lineTo(192f, 110.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                lineTo(152f, 67.31f)
                lineTo(152f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(136f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(163.31f, 56f)
                lineTo(201f, 93.66f)
                arcToRelative(23.85f, 23.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                lineTo(208f, 161f)
                arcTo(32.06f, 32.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 192f)
                close()
            }
        }.build()

        return _GitPullRequestFill!!
    }

@Suppress("ObjectPropertyName")
private var _GitPullRequestFill: ImageVector? = null
