package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ChatsTeardropDuotone: ImageVector
    get() {
        if (_ChatsTeardropDuotone != null) {
            return _ChatsTeardropDuotone!!
        }
        _ChatsTeardropDuotone = ImageVector.Builder(
            name = "Duotone.ChatsTeardropDuotone",
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
                moveTo(163.94f, 80.11f)
                horizontalLineToRelative(0f)
                arcTo(71.83f, 71.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 104f)
                horizontalLineToRelative(0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, 72f)
                horizontalLineTo(92.1f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 224f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(152f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 163.94f, 80.11f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 176f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(104f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 32f)
                horizontalLineToRelative(0f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 72f)
                horizontalLineToRelative(0f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(92.1f, 176f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 224f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(152f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -68.06f, -71.89f)
            }
        }.build()

        return _ChatsTeardropDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ChatsTeardropDuotone: ImageVector? = null
