package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FileCloudDuotone: ImageVector
    get() {
        if (_FileCloudDuotone != null) {
            return _FileCloudDuotone!!
        }
        _FileCloudDuotone = ImageVector.Builder(
            name = "Duotone.FileCloudDuotone",
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
                moveTo(152f, 32f)
                lineToRelative(0f, 56f)
                lineToRelative(56f, 0f)
                lineToRelative(-56f, -56f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(108f, 136f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -42.34f, 32f)
                verticalLineToRelative(0f)
                horizontalLineTo(60f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 56f)
                horizontalLineToRelative(48f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -88f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 32f)
                lineToRelative(0f, 56f)
                lineToRelative(56f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 224f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(88f)
                lineTo(152f, 32f)
                horizontalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineToRelative(88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
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

        return _FileCloudDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FileCloudDuotone: ImageVector? = null
