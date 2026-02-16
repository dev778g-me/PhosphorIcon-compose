package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PencilSimpleSlashFill: ImageVector
    get() {
        if (_PencilSimpleSlashFill != null) {
            return _PencilSimpleSlashFill!!
        }
        _PencilSimpleSlashFill = ImageVector.Builder(
            name = "Filled.PencilSimpleSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.32f, 73.37f)
                lineTo(182.63f, 28.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 0f)
                lineTo(115.64f, 73.05f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.14f, 5.52f)
                lineToRelative(58.73f, 64.6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.79f, 0.13f)
                lineTo(227.32f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.32f, 73.37f)
                close()
                moveTo(192f, 108.69f)
                lineTo(147.32f, 64f)
                lineToRelative(24f, -24f)
                lineTo(216f, 84.69f)
                close()
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineTo(154.4f, 168.92f)
                lineTo(104f, 219.31f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92.69f, 224f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 163.31f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36.68f, 152f)
                lineToRelative(53.6f, -53.6f)
                lineToRelative(-48f, -52.82f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.37f, -10.75f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, -0.21f)
                close()
            }
        }.build()

        return _PencilSimpleSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _PencilSimpleSlashFill: ImageVector? = null
