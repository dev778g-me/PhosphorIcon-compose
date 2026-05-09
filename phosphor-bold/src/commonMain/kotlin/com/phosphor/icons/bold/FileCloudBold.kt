package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.FileCloudBold: ImageVector
    get() {
        if (_FileCloudBold != null) {
            return _FileCloudBold!!
        }
        _FileCloudBold = ImageVector.Builder(
            name = "Bold.FileCloudBold",
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
                moveTo(148f, 32f)
                lineToRelative(0f, 60f)
                lineToRelative(60f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 224f)
                horizontalLineToRelative(20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(88f)
                lineTo(152f, 32f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(84f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(65.66f, 168f)
                horizontalLineTo(60f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 56f)
                horizontalLineToRelative(48f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, -43.82f, -48f)
            }
        }.build()

        return _FileCloudBold!!
    }

@Suppress("ObjectPropertyName")
private var _FileCloudBold: ImageVector? = null
