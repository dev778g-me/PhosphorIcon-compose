package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.ChatsTeardropBold: ImageVector
    get() {
        if (_ChatsTeardropBold != null) {
            return _ChatsTeardropBold!!
        }
        _ChatsTeardropBold = ImageVector.Builder(
            name = "Bold.ChatsTeardropBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
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
                strokeLineWidth = 24f,
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

        return _ChatsTeardropBold!!
    }

@Suppress("ObjectPropertyName")
private var _ChatsTeardropBold: ImageVector? = null
