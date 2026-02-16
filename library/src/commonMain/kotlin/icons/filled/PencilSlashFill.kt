package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PencilSlashFill: ImageVector
    get() {
        if (_PencilSlashFill != null) {
            return _PencilSlashFill!!
        }
        _PencilSlashFill = ImageVector.Builder(
            name = "Filled.PencilSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(53.92f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.08f, 45.38f)
                lineToRelative(48.2f, 53f)
                lineTo(36.68f, 152f)
                arcTo(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 163.31f)
                lineTo(32f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(92.69f, 224f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 219.31f)
                lineToRelative(50.4f, -50.39f)
                lineToRelative(47.69f, 52.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
                moveTo(101.06f, 110.26f)
                lineTo(117f, 127.74f)
                lineTo(68f, 176.69f)
                lineTo(51.31f, 160f)
                close()
                moveTo(48f, 208f)
                lineTo(48f, 179.31f)
                lineTo(76.69f, 208f)
                close()
                moveTo(96f, 204.69f)
                lineTo(79.32f, 188f)
                lineToRelative(48.41f, -48.41f)
                lineToRelative(15.89f, 17.48f)
                close()
                moveTo(227.32f, 96f)
                lineTo(183f, 140.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 171.67f, 129f)
                lineToRelative(14.68f, -14.68f)
                lineTo(169.66f, 97.66f)
                lineTo(156.31f, 111f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 145f, 99.69f)
                lineToRelative(13.35f, -13.35f)
                horizontalLineToRelative(0f)
                lineTo(141.66f, 69.66f)
                lineToRelative(-12f, 12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.31f)
                lineTo(160f, 28.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.63f, 0f)
                lineToRelative(44.69f, 44.68f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 227.32f, 96f)
                close()
            }
        }.build()

        return _PencilSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _PencilSlashFill: ImageVector? = null
