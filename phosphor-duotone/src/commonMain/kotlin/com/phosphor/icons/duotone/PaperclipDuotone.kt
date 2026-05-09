package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.PaperclipDuotone: ImageVector
    get() {
        if (_PaperclipDuotone != null) {
            return _PaperclipDuotone!!
        }
        _PaperclipDuotone = ImageVector.Builder(
            name = "Duotone.PaperclipDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(198.63f, 86.63f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, -45.26f)
                lineTo(54.06f, 142.06f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.88f, 67.88f)
                lineTo(204f, 128f)
                lineToRelative(-23.25f, -23.25f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 80f)
                lineTo(76.69f, 164.69f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.63f, 22.62f)
                lineTo(198.63f, 86.63f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, -45.26f)
                lineTo(54.06f, 142.06f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.88f, 67.88f)
                lineTo(204f, 128f)
            }
        }.build()

        return _PaperclipDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipDuotone: ImageVector? = null
